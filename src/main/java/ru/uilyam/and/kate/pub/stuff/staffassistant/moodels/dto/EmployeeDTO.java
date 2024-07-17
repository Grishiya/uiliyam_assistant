package ru.uilyam.and.kate.pub.stuff.staffassistant.moodels.dto;

import ru.uilyam.and.kate.pub.stuff.staffassistant.Role;

import java.util.Objects;

public class EmployeeDTO {
    private int id;
    private Role role;
    private String firstName;

    private Long telegramChatId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO employee = (EmployeeDTO) o;
        return id == employee.id && role == employee.role && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role, firstName);
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", role=" + role +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
