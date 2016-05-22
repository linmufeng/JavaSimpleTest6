public class StudentAccessAuthority
{
    private int age;

    public void setAge(int age){
        if (age >= 7 && age <= 28) {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}
