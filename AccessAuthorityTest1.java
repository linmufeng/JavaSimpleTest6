class AccessAuthorityTest1
{
    public static void main(String[] args) 
    {
        StudentAccessAuthority zhang = new StudentAccessAuthority();
        StudentAccessAuthority deng = new StudentAccessAuthority();

        zhang.setAge(22);
        System.out.println("��ͬѧ����" + zhang.getAge() + "��");

        deng.setAge(25);
        System.out.println("��ͬѧ����" + deng.getAge() + "��");
    }
}
