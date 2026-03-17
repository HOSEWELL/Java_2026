package com.github.hosewell.builder;

public class Intern {
    private final String firstName;
    private final String lastName;
    private final String department;

    // Private constructor so only the Builder can create the object
    private Intern(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public interface FirstNameStep {
        LastNameStep setFirstName(String firstName);
    }

    public interface LastNameStep {
        DepartmentStep setLastName(String lastName);
    }

    public interface DepartmentStep {
        BuildStep setDepartment(String department);
    }

    public interface BuildStep {
        Intern build();
    }

    // --- STEP 2: The Builder (The "Train" that stays on the tracks) ---

    public static class InternBuilder implements FirstNameStep, LastNameStep, DepartmentStep, BuildStep {
        private String firstName;
        private String lastName;
        private String department;

        // Entry point: This starts the chain
        public static FirstNameStep start() {
            return new InternBuilder();
        }

        @Override
        public LastNameStep setFirstName(String firstName) {
            this.firstName = firstName;
            return this; // Returning the interface for the NEXT step
        }

        @Override
        public DepartmentStep setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public BuildStep setDepartment(String department) {
            this.department = department;
            return this;
        }

        @Override
        public Intern build() {
            return new Intern(firstName, lastName, department);
        }
    }

    @Override
    public String toString() {
        return "Intern [Name=" + firstName + " " + lastName + ", Dept=" + department + "]";
    }
}