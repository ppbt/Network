package class11;

class ParentClass {  //���常��
    public ParentClass(int i) {  //���췽��
        System.out.println("���Ǹ���Ĺ��췽����");
    }
    

}
class ChildClass extends ParentClass {  //�̳и���
    public ChildClass() {  //���췽��    	
    	super(1);
        System.out.println("��������Ĺ��췽����");
    }
}
public class Demo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass(); 
    }
}
