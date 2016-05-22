class AccessAuthorityTest1
{
    public static void main(String[] args) 
    {
        StudentAccessAuthority zhang = new StudentAccessAuthority();
        StudentAccessAuthority deng = new StudentAccessAuthority();

        zhang.setAge(22);
        System.out.println("张同学今年" + zhang.getAge() + "岁");

        deng.setAge(25);
        System.out.println("邓同学今年" + deng.getAge() + "岁");
    }
}
