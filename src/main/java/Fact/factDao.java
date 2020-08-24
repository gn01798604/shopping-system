package Fact;

import Dao.member.memberDao;
import Dao.message.messageDao;
import Dao.porder.porderDao;

public class factDao {
	public memberDao md;
	public porderDao pd;
	public messageDao msgd;
	public memberDao getMd() {
		return md;
	}
	public void setMd(memberDao md) {
		this.md = md;
	}
	public porderDao getPd() {
		return pd;
	}
	public void setPd(porderDao pd) {
		this.pd = pd;
	}
	public messageDao getMsgd() {
		return msgd;
	}
	public void setMsgd(messageDao msgd) {
		this.msgd = msgd;
	}
	
	
}
