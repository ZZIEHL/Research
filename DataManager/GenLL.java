/*
 *
 Written By Zachary Ziehl
 */
import java.util.*;
public class GenLL <T>  
{
	private class ListNode
	{
		T data;
		ListNode link;
		ListNode prev;
		public ListNode(T listData, ListNode listLink)
		{
			data = listData;
			link = listLink;
			
		}
	}
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	private int size;
	public GenLL()
	{
		head = current = previous = null;
		this.size= 0;
		
	}
	public void add(T listData)
	{
		ListNode newNode = new ListNode(listData, null);
		if(head == null)
		{
			head = current = newNode;
			this.size = 1;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
			temp = temp.link;
		temp.link = newNode;
		this.size++;
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void addAfterCurrent(T listData)
	{
		if(current == null)
			return;
		ListNode newNode = new ListNode(listData, current.link);
		current.link = newNode;
		this.size++;
	}
	public T getCurrent()
	{
		if(current == null)
			return null;
		return current.data;
	}
	public void setCurrent(T listData)
	{
		if(listData == null || current == null)
			return;
		current.data = listData;
	}
	public void gotoNext()
	{
		if(current == null)
			return;
		previous = current;
		current = current.link;
		
	}
	public void gotoPrev()
	{
		if(current != null)
		{
			current = previous;
			current.link = current;
		}
	}
	public void reset()
	{
		current = head;
		previous = null;
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public void removeCurrent()
	{
		if(current != null && previous != null)
		{
			previous.link = current.link;
			current = current.link;
		}
		else if(current != null && previous == null)
		{
			head = head.link;//current = current.link essentially
			current = head;
		}
	}
	public boolean contains(T aData) {
		
		if(current.equals(aData)) return true;
			if(current.link == null) return false;
			else return false;
		}
	public int getSize()
	{
		return this.size;
	}
	public T getAt(int index)
	{
		if(index < 0 || index >= size)
			return null;
		ListNode temp = head;
		for(int i=0;i<index;i++)
			temp = temp.link;
		return temp.data;
		
	}
	public void setAt(int index,T listData)
	{
		if(index < 0 || index >= size || listData == null)
			return;
		ListNode temp = head;
		for(int i=0;i<index;i++)
			temp = temp.link;
		temp.data=listData;
	}
	public void deleteNodes(ListNode temp)
	{
		if(head == null || temp == null)
		{
			return;
		}
		if(head == temp)
		{
			head = temp.link;
		}
		if(temp.link != null)
		{
			temp.link.prev = temp.prev;
		}
		if(temp.prev != null)
		{
			temp.prev.link = temp.link;
		}

		
		
	}

}
