//Students table
public class students_tbl
{
	private BigDecimal _student_ID;
	public BigDecimal getstudent_ID()
	{
		return this._student_ID;
	}
	public void setstudent_ID(BigDecimal value)
	{
		this._student_ID = value;
	}

	private String _student_FName;
	public String getstudent_FName()
	{
		return this._student_FName;
	}
	public void setstudent_FName(String value)
	{
		this._student_FName = value;
	}

	private String _student_ONames;
	public String getstudent_ONames()
	{
		return this._student_ONames;
	}
	public void setstudent_ONames(String value)
	{
		this._student_ONames = value;
	}

	private String _student_Email;
	public String getstudent_Email()
	{
		return this._student_Email;
	}
	public void setstudent_Email(String value)
	{
		this._student_Email = value;
	}

	private String _student_Phone;
	public String getstudent_Phone()
	{
		return this._student_Phone;
	}
	public void setstudent_Phone(String value)
	{
		this._student_Phone = value;
	}

	private String _student_Course;
	public String getstudent_Course()
	{
		return this._student_Course;
	}
	public void setstudent_Course(String value)
	{
		this._student_Course = value;
	}


	public students_tbl(BigDecimal student_ID_,String student_FName_,String student_ONames_,String student_Email_,String student_Phone_,String student_Course_)
	{
		this.student_ID = student_ID_;
		this.student_FName = student_FName_;
		this.student_ONames = student_ONames_;
		this.student_Email = student_Email_;
		this.student_Phone = student_Phone_;
		this.student_Course = student_Course_;
	}
}
//end of students table

//hostserver_tbl
public class hostServer_tbl
{
	private String _serverIP;
	public String getserverIP()
	{
		return this._serverIP;
	}
	public void setserverIP(String value)
	{
		this._serverIP = value;
	}

	private String _serverName;
	public String getserverName()
	{
		return this._serverName;
	}
	public void setserverName(String value)
	{
		this._serverName = value;
	}


	public hostServer_tbl(String serverIP_,String serverName_)
	{
		this.serverIP = serverIP_;
		this.serverName = serverName_;
	}
}
//end of host server tbl

//start servers_tbl
public class servers_tbl
{
	private String _serversIP;
	public String getserversIP()
	{
		return this._serversIP;
	}
	public void setserversIP(String value)
	{
		this._serversIP = value;
	}

	private String _contents;
	public String getcontents()
	{
		return this._contents;
	}
	public void setcontents(String value)
	{
		this._contents = value;
	}

	private String _opSys;
	public String getopSys()
	{
		return this._opSys;
	}
	public void setopSys(String value)
	{
		this._opSys = value;
	}

	private String _hostServerIP;
	public String gethostServerIP()
	{
		return this._hostServerIP;
	}
	public void sethostServerIP(String value)
	{
		this._hostServerIP = value;
	}

	private String _serverIP;
	public String getserverIP()
	{
		return this._serverIP;
	}
	public void setserverIP(String value)
	{
		this._serverIP = value;
	}


	public servers_tbl(String serversIP_,String contents_,String opSys_,String hostServerIP_,String serverIP_)
	{
		this.serversIP = serversIP_;
		this.contents = contents_;
		this.opSys = opSys_;
		this.hostServerIP = hostServerIP_;
		this.serverIP = serverIP_;
	}
}
//end servers_tbl

//start databases_tbl
public class databases_tbl
{
	private BigDecimal _database_id;
	public BigDecimal getdatabase_id()
	{
		return this._database_id;
	}
	public void setdatabase_id(BigDecimal value)
	{
		this._database_id = value;
	}

	private String _database_name;
	public String getdatabase_name()
	{
		return this._database_name;
	}
	public void setdatabase_name(String value)
	{
		this._database_name = value;
	}

	private String _database_type;
	public String getdatabase_type()
	{
		return this._database_type;
	}
	public void setdatabase_type(String value)
	{
		this._database_type = value;
	}

	private String _SID;
	public String getSID()
	{
		return this._SID;
	}
	public void setSID(String value)
	{
		this._SID = value;
	}

	private String _portNumber;
	public String getportNumber()
	{
		return this._portNumber;
	}
	public void setportNumber(String value)
	{
		this._portNumber = value;
	}

	private BigDecimal _students_ID;
	public BigDecimal getstudents_ID()
	{
		return this._students_ID;
	}
	public void setstudents_ID(BigDecimal value)
	{
		this._students_ID = value;
	}

	private String _serverIP;
	public String getserverIP()
	{
		return this._serverIP;
	}
	public void setserverIP(String value)
	{
		this._serverIP = value;
	}


	public databases_tbl(BigDecimal database_id_,String database_name_,String database_type_,String SID_,String portNumber_,BigDecimal students_ID_,String serverIP_)
	{
		this.database_id = database_id_;
		this.database_name = database_name_;
		this.database_type = database_type_;
		this.SID = SID_;
		this.portNumber = portNumber_;
		this.students_ID = students_ID_;
		this.serverIP = serverIP_;
	}
}
//end databases_tbl

//start special_requests
public class special_requests
{
	private BigDecimal _request_id;
	public BigDecimal getrequest_id()
	{
		return this._request_id;
	}
	public void setrequest_id(BigDecimal value)
	{
		this._request_id = value;
	}

	private String _request_title;
	public String getrequest_title()
	{
		return this._request_title;
	}
	public void setrequest_title(String value)
	{
		this._request_title = value;
	}

	private String _request_body;
	public String getrequest_body()
	{
		return this._request_body;
	}
	public void setrequest_body(String value)
	{
		this._request_body = value;
	}

	private String _request_date;
	public String getrequest_date()
	{
		return this._request_date;
	}
	public void setrequest_date(String value)
	{
		this._request_date = value;
	}

	private String _request_response;
	public String getrequest_response()
	{
		return this._request_response;
	}
	public void setrequest_response(String value)
	{
		this._request_response = value;
	}

	private String _response_date;
	public String getresponse_date()
	{
		return this._response_date;
	}
	public void setresponse_date(String value)
	{
		this._response_date = value;
	}

	private String _request_status;
	public String getrequest_status()
	{
		return this._request_status;
	}
	public void setrequest_status(String value)
	{
		this._request_status = value;
	}

	private BigDecimal _student_id;
	public BigDecimal getstudent_id()
	{
		return this._student_id;
	}
	public void setstudent_id(BigDecimal value)
	{
		this._student_id = value;
	}


	public special_requests(BigDecimal request_id_,String request_title_,String request_body_,String request_date_,String request_response_,String response_date_,String request_status_,BigDecimal student_id_)
	{
		this.request_id = request_id_;
		this.request_title = request_title_;
		this.request_body = request_body_;
		this.request_date = request_date_;
		this.request_response = request_response_;
		this.response_date = response_date_;
		this.request_status = request_status_;
		this.student_id = student_id_;
	}
}
//end special_requests

//start courses_tbl
public class courses_tbl
{
	private BigDecimal _course_id;
	public BigDecimal getcourse_id()
	{
		return this._course_id;
	}
	public void setcourse_id(BigDecimal value)
	{
		this._course_id = value;
	}

	private String _course_name;
	public String getcourse_name()
	{
		return this._course_name;
	}
	public void setcourse_name(String value)
	{
		this._course_name = value;
	}

	private String _course_shortName;
	public String getcourse_shortName()
	{
		return this._course_shortName;
	}
	public void setcourse_shortName(String value)
	{
		this._course_shortName = value;
	}


	public courses_tbl(BigDecimal course_id_,String course_name_,String course_shortName_)
	{
		this.course_id = course_id_;
		this.course_name = course_name_;
		this.course_shortName = course_shortName_;
	}
}
//end courses_tbl

//start users_tbl
public class users_tbl
{
	private BigDecimal _user_id;
	public BigDecimal getuser_id()
	{
		return this._user_id;
	}
	public void setuser_id(BigDecimal value)
	{
		this._user_id = value;
	}

	private String _first_name;
	public String getfirst_name()
	{
		return this._first_name;
	}
	public void setfirst_name(String value)
	{
		this._first_name = value;
	}

	private String _other_names;
	public String getother_names()
	{
		return this._other_names;
	}
	public void setother_names(String value)
	{
		this._other_names = value;
	}

	private String _username;
	public String getusername()
	{
		return this._username;
	}
	public void setusername(String value)
	{
		this._username = value;
	}

	private String _passwds;
	public String getpasswds()
	{
		return this._passwds;
	}
	public void setpasswds(String value)
	{
		this._passwds = value;
	}


	public users_tbl(BigDecimal user_id_,String first_name_,String other_names_,String username_,String passwds_)
	{
		this.user_id = user_id_;
		this.first_name = first_name_;
		this.other_names = other_names_;
		this.username = username_;
		this.passwds = passwds_;
	}
}
//end users_tbl