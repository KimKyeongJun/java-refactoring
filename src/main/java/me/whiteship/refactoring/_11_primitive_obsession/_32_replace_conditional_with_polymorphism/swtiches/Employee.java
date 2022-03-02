package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

// 조건에 따라 타입에 따라 Switch 문을 사용하는 경우에 하는 리팩토링
public abstract class Employee {

    protected List<String> availableProjects;

    public Employee() {
    }

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public abstract int vacationHours();

    public boolean canAccessTo(String project) {
        return this.availableProjects.contains(project);
    }
}
