package paixu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

public class test {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("�����");
	list.add("����¯����");
	list.add("������");
	list.add("���ֻ�");
	list.add("¯����");
	list.add("¯����");
	list.add("��¯");
	for(int j=0;j<list.size();j++){
		for(int i=0;i<list.size()-1-j;i++){
			if(list.get(i).length()>list.get(i+1).length()){
				String a = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, a);
			}
		}
	}
	for(int j=0;j<list.size();j++){
		for(int i=0;i<list.size()-1-j;i++){
			if((list.get(i).indexOf("��")>=0)&&(list.get(i+1).indexOf("��")<0)){
				String a = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, a);
			}
		}
	}

	System.out.println(list);
}
}
