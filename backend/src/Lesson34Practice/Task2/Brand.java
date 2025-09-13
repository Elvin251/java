package Lesson34Practice.Task2;

class Brand {
    int id;
    String name;

    Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void printInfo() {
        System.out.println("Brand ID: " + id + ", Brand Name: " + name);
    }
}

class Model extends Brand {
    int modelId;
    String modelName;
    int brandId;

    Model(int brandId, String brandName, int modelId, String modelName) {
        super(brandId, brandName); // Brand konstruktorunu çağırır
        this.modelId = modelId;
        this.modelName = modelName;
        this.brandId = brandId;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Model ID: " + modelId + ", Model Name: " + modelName + ", BrandId: " + brandId);
    }
}
