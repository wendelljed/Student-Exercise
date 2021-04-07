
class Student {

        // Member variables of the class.
        private int id;
        private String name;
        private String studentCurriculum;

        public int getId() {return id;}
        public void setId(int id) {this.id = id;}
        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
        public String getStudentCurriculum() {return studentCurriculum;}
        public void setStudentCurriculum(String studentCurriculum)
        {
            this.studentCurriculum = studentCurriculum;
        }

        // 'toString()' method to print the values.

        public String toString() {
            return "Student: [ID = " + getId() + ", Name = " + getName() + ", Curriculum = " + getStudentCurriculum() + "]";
        }
    }

