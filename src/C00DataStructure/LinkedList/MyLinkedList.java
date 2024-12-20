package C00DataStructure.LinkedList;

import org.w3c.dom.Node;

public class MyLinkedList
{
    private MyListNode head;
    int count;

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }
    public  MyListNode addElement(String data)
    {
        MyListNode newNode;
        if(head == null)
        {   //맨처음일때
            newNode = new MyListNode(data);
            head = newNode;
        }else
        {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null)    //맨뒤로 가서
                temp = temp.next;
            temp.next = newNode;
        }
        count++;
        return newNode;
    }
    public MyListNode insertElement(int position , String data){
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count)
        {
            System.out.println("추가 할 위치 오류 입니다. 현재 리시트의 개수는 "+count+"개 입니다.");
            return null;
        }
        if(position == 0 )
        {     //맨앞으로 들어가는 경우
            newNode.next = head;
            head = newNode;
        }else
        {
            MyListNode preNode = null;
            for(i= 0 ; i<position ; i++)
            {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position)
    {
        int i ;
        MyListNode tempNode = head;

        if(position == 0 )
        {     //맨 앞을 삭제하는
            head = tempNode.next;
        }else
        {
            MyListNode preNode = null;
            for(i= 0 ; i < position ; i++)
            {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count++;
        System.out.println(position + "번째 항목이 삭제 되었습니다.");

        return tempNode;
    }

//    public String getElement(int position)
//    {
//
//    }



}
