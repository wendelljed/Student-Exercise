
class Student {
        // Employee class.

        // Member variables of the class.
        private int id;
        private String name;
        private String studentCurriculum;

        public int getId() {return id;}
        public void setId(final int id) {this.id = id;}
        public String getName() {return name;}
        public void setName(final String name) {this.name = name;}
        public String getStudentCurriculum() {return studentCurriculum;}
        public void setStudentCurriculum(final String studentCurriculum)
        {
            this.studentCurriculum = studentCurriculum;
        }

        // 'toString()' method to print the values.

        public String toString() {
            return "Student: [id= " + getId() + ", name= " + getName() + ", Curriculum= " + getStudentCurriculum() + "]";
        }
    }

