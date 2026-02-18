const API_URL = "http://localhost:8080";

function saveToken(token) {
    sessionStorage.setItem("token", token);
}

function getToken() {
    return sessionStorage.getItem("token");
}

function logout() {
    sessionStorage.removeItem("token");
    alert("Çıxış edildi");
    window.location.href = "login.html";
}

async function register() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const res = await fetch(`${API_URL}/auth/register`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password })
    });

    if (res.ok) {
        alert("Qeydiyyat uğurla tamamlandı!");
        window.location.href = "login.html";
    } else {
        alert("Qeydiyyat xətası!");
    }
}

async function login() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const res = await fetch(`${API_URL}/auth/login`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password })
    });

    if (res.ok) {
        const data = await res.json();
        saveToken(data.token);
        alert("Login uğurlu!");
        window.location.href = "index.html";
    } else {
        alert("Login səhvdir!");
    }
}

let page = 0;

async function loadAds() {
    const brand = document.getElementById("brandFilter")?.value || "";
    const minPrice = document.getElementById("minPrice")?.value || "";
    const maxPrice = document.getElementById("maxPrice")?.value || "";

    let url = `${API_URL}/ads?page=${page}`;
    if (brand) url += `&brand=${brand}`;
    if (minPrice) url += `&minPrice=${minPrice}`;
    if (maxPrice) url += `&maxPrice=${maxPrice}`;

    const res = await fetch(url);
    if (!res.ok) return alert("Elanlar yüklənmədi!");

    const ads = await res.json();
    const container = document.getElementById("adsContainer");
    container.innerHTML = "";

    ads.forEach(ad => {
        container.innerHTML += `
        <div class="card">
            <img src="${ad.imageUrl}" alt="car">
            <h3>${ad.brandName} ${ad.modelName}</h3>
            <p>${ad.price} AZN</p>
            <p>${ad.city}</p>
            <button onclick="openDetail(${ad.id})">Ətraflı</button>
        </div>
        `;
    });

    document.getElementById("pageNumber").innerText = page + 1;
}

function nextPage() { page++; loadAds(); }
function prevPage() { if(page>0) page--; loadAds(); }

function openDetail(id) {
    window.location.href = "detail.html?id=" + id;
}

async function loadDetail() {
    const params = new URLSearchParams(window.location.search);
    const id = params.get("id");
    const res = await fetch(`${API_URL}/ads/${id}`);
    if(!res.ok) return alert("Detail tapılmadı");

    const ad = await res.json();
    document.getElementById("detail").innerHTML = `
        <h2>${ad.brandName} ${ad.modelName}</h2>
        <img src="${ad.imageUrl}" width="300">
        <p>Qiymət: ${ad.price} AZN</p>
        <p>Şəhər: ${ad.city}</p>
        <p>${ad.description}</p>
    `;
    window.currentAdId = id;
}

async function addFavorite() {
    const token = getToken();
    const res = await fetch(`${API_URL}/favorites`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            "Authorization": "Bearer " + token
        },
        body: JSON.stringify({ adId: window.currentAdId })
    });
    if(res.ok) alert("Seçilmişlərə əlavə edildi!");
    else alert("Xəta baş verdi!");
}

async function loadFavorites() {
    const token = getToken();
    const res = await fetch(`${API_URL}/favorites`, {
        headers: { "Authorization": "Bearer " + token }
    });
    const ads = await res.json();
    const container = document.getElementById("favorites");
    container.innerHTML = "";

    ads.forEach(ad => {
        container.innerHTML += `
        <div class="card">
            <h3>${ad.brandName} ${ad.modelName}</h3>
            <p>${ad.price} AZN</p>
            <button onclick="removeFavorite(${ad.id})">Sil</button>
        </div>
        `;
    });
}

async function removeFavorite(id) {
    const token = getToken();
    await fetch(`${API_URL}/favorites/${id}`, {
        method: "DELETE",
        headers: { "Authorization": "Bearer " + token }
    });
    alert("Seçilmiş silindi!");
    loadFavorites();
}

async function addAd() {
    const token = getToken();
    const ad = {
        brandId: document.getElementById("brand").value,
        modelId: document.getElementById("model").value,
        year: document.getElementById("year").value,
        price: document.getElementById("price").value,
        city: document.getElementById("city").value,
        imageUrl: document.getElementById("imageUrl").value,
        description: document.getElementById("description").value
    };

    const res = await fetch(`${API_URL}/ads`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
            "Authorization": "Bearer " + token
        },
        body: JSON.stringify(ad)
    });

    if(res.ok) {
        alert("Elan əlavə edildi!");
        window.location.href = "index.html";
    } else alert("Elan əlavə etmək olmadı!");
}

async function loadMyAds() {
    const token = getToken();
    const res = await fetch(`${API_URL}/ads/my`, {
        headers: { "Authorization": "Bearer " + token }
    });

    const ads = await res.json();
    const container = document.getElementById("myAds");
    container.innerHTML = "";

    ads.forEach(ad => {
        container.innerHTML += `
        <div class="card">
            <h3>${ad.brandName} ${ad.modelName}</h3>
            <p>${ad.price} AZN</p>
            <button onclick="deleteAd(${ad.id})">Sil</button>
        </div>
        `;
    });
}

async function deleteAd(id) {
    const token = getToken();
    await fetch(`${API_URL}/ads/${id}`, {
        method: "DELETE",
        headers: { "Authorization": "Bearer " + token }
    });
    alert("Elan silindi!");
    loadMyAds();
}

window.onload = function() {
    if(document.getElementById("adsContainer")) loadAds();
    if(document.getElementById("detail")) loadDetail();
    if(document.getElementById("favorites")) loadFavorites();
    if(document.getElementById("myAds")) loadMyAds();
};