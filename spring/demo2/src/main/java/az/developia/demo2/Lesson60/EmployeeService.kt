package az.developia.demo2.Lesson60

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
@RequiredArgsConstructor
class EmployeeService {
    private val employeeRepository: EmployeeRepository? = null
    val all: List<EmployeeEntity>
        get() = employeeRepository!!.findAll()

    fun getBySalaryRange(min: Double?, max: Double?): List<EmployeeEntity> {
        return employeeRepository!!.findBySalaryBetween(min, max)
    }

    val salaryGreaterThan3000: List<EmployeeEntity>
        get() = employeeRepository!!.findBySalaryGreaterThan(3000.0)
    val emailsEndingWithAz: List<EmployeeEntity>
        get() = employeeRepository!!.findByEmailEndingWith(".az")

    fun searchFullName(keyword: String?): List<EmployeeEntity> {
        return employeeRepository!!.searchByFullName(keyword)
    }

    fun getBirthdayRange(begin: LocalDate?, end: LocalDate?): List<EmployeeEntity> {
        return employeeRepository!!.findByBirthdayBetween(begin, end)
    }

    val experienceBetween5And10: List<EmployeeEntity>
        get() = employeeRepository!!.findByExperienceYearBetween(5, 10)
    val phonesStarting055: List<EmployeeEntity>
        get() = employeeRepository!!.findByPhoneStartingWith("055")

    fun save(e: EmployeeEntity) {
        employeeRepository!!.save(e)
    }
}
