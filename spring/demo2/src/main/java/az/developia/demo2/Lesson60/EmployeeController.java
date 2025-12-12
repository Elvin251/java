package az.developia.demo2.Lesson60;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeEntity> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/salary-range")
    public List<EmployeeEntity> getBySalaryRange(
            @RequestParam Double min,
            @RequestParam Double max) {
        return employeeService.getBySalaryRange(min, max);
    }

    @GetMapping("/salary-gt-3000")
    public List<EmployeeEntity> getSalaryGreaterThan3000() {
        return employeeService.getSalaryGreaterThan3000();
    }

    @GetMapping("/email-az")
    public List<EmployeeEntity> getEmailsEndingWithAz() {
        return employeeService.getEmailsEndingWithAz();
    }

    @GetMapping("/search-fullname")
    public List<EmployeeEntity> searchFullName(@RequestParam String keyword) {
        return employeeService.searchFullName(keyword);
    }

    @GetMapping("/birthday-range")
    public List<EmployeeEntity> getByBirthdayRange(
            @RequestParam String begin,
            @RequestParam String end) {
        return employeeService.getByBirthdayRange(
                LocalDate.parse(begin),
                LocalDate.parse(end)
        );
    }

    @GetMapping("/experience-5-10")
    public List<EmployeeEntity> getExperienceBetween5And10() {
        return employeeService.getExperienceBetween5And10();
    }

    @GetMapping("/phone-055")
    public List<EmployeeEntity> getPhonesStarting055() {
        return employeeService.getPhonesStarting055();
    }

    @PostMapping
    public void add(@RequestBody EmployeeEntity employee) {
        employeeService.save(employee);
    }
}
