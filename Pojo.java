package aa;

public class Pojo {
	public String stuname;
	private int stuid;
	public String stuclass;
	Pojo(String stuname,int stuid,String stuclass){
		this.stuclass=stuclass;
		this.stuid=stuid;
		this.stuname=stuname;
	}
	
	public String getStuName() {
		return stuname;
	}
	
	public String getStuclass() {
		return stuclass;
	}
	
	public int getStudentId() {
		return stuid;
	}
	public static void main(String[] args) {
		Pojo sb=new Pojo("aRUN",20,"TENTH");
		Pojo s1=new Pojo("jdjcj",20,"TENTH");
		Pojo sb2=new Pojo("aRUN",21,"TENTH");
	String sr=sb.getStuclass();
	int vr=sb.getStudentId();
	String rr=sb.getStuName();
	System.out.println(sr);
	System.out.println(vr);
	System.out.println(rr);
	String s=s1.getStuclass();
	int v=s1.getStudentId();
	String r=s1.getStuName();
	System.out.println(s);
	System.out.println(v);
	System.out.println(r);
	}

}

