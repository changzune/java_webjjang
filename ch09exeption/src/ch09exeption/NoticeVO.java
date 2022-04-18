package ch09exeption;

public class NoticeVO {
	
	long no;
	String title;
	String content;
	String writeDate;
	
public NoticeVO() {
	// TODO Auto-generated constructor stub
}

public long getNo() {
	return no;
}

public void setNo(long no) {
	this.no = no;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getWriteDate() {
	return writeDate;
}

public void setWriteDate(String writeDate) {
	this.writeDate = writeDate;
}

@Override
public String toString() {
	return "NotiveVO [no=" + no + ", title=" + title + ", content=" + content + ", writeDate=" + writeDate + "]";
}	




}
