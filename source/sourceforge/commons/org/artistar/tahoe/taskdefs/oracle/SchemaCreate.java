
package org.artistar.tahoe.taskdefs.oracle;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;



/**<code>SchemaCreate</code>
 * <br>created on 25.09.2003
 * @author Jacek Kempski<br>
 * 
 */
public class SchemaCreate extends Task {
	/**
	 * This tells how the attributes are named
	 */
	public static final String EVOTYPES =
		" create table EVOTYPES"
			+ " ("
			+ " AKEY               INTEGER                unique,"
			+ " NODETYPE           VARCHAR2(100)          not null,"
			+ " NODENAME           VARCHAR2(100)          not null,"
			+ " APPL_KEY           VARCHAR2(350)                  ,"
			+ " OWNER              VARCHAR2(100)                  ,"
			+ " DIVISION_ID        INTEGER                        ,"
			+ " ATINHERIT          VARCHAR2(100)                  ,"
			+ " AT000AT            VARCHAR2(100)                 ,"
			+ " AT001AT            VARCHAR2(100)                 ,"
			+ " AT002AT            VARCHAR2(100)                 ,"
			+ " AT003AT            VARCHAR2(100)                 ,"
			+ " AT004AT            VARCHAR2(100)                 ,"
			+ " AT005AT            VARCHAR2(100)                 ,"
			+ " AT006AT            VARCHAR2(100)                 ,"
			+ " AT007AT            VARCHAR2(100)                 ,"
			+ " AT008AT            VARCHAR2(100)                 ,"
			+ " AT009AT            VARCHAR2(100)                 ,"
			+ " AT010AT            VARCHAR2(100)                 ,"
			+ " AT011AT            VARCHAR2(100)                 ,"
			+ " AT012AT            VARCHAR2(100)                 ,"
			+ " AT013AT            VARCHAR2(100)                 ,"
			+ " AT014AT            VARCHAR2(100)                 ,"
			+ " AT015AT            VARCHAR2(100)                 ,"
			+ " AT016AT            VARCHAR2(100)                 ,"
			+ " AT017AT            VARCHAR2(100)                 ,"
			+ " AT018AT            VARCHAR2(100)                 ,"
			+ " AT019AT            VARCHAR2(100)                 ,"
			+ " AT020AT            VARCHAR2(100)                 ,"
			+ " AT021AT            VARCHAR2(100)                 ,"
			+ " AT022AT            VARCHAR2(100)                 ,"
			+ " AT023AT            VARCHAR2(100)                 ,"
			+ " AT024AT            VARCHAR2(100)                 ,"
			+ " AT025AT            VARCHAR2(100)                 ,"
			+ " AT026AT            VARCHAR2(100)                 ,"
			+ " AT027AT            VARCHAR2(100)                 ,"
			+ " AT028AT            VARCHAR2(100)                 ,"
			+ " AT029AT            VARCHAR2(100)                 ,"
			+ " AT030AT            VARCHAR2(100)                 ,"
			+ " AT031AT            VARCHAR2(100)                 ,"
			+ " AT032AT            VARCHAR2(100)                 ,"
			+ " AT033AT            VARCHAR2(100)                 ,"
			+ " AT034AT            VARCHAR2(100)                 ,"
			+ " AT035AT            VARCHAR2(100)                 ,"
			+ " AT036AT            VARCHAR2(100)                 ,"
			+ " AT037AT            VARCHAR2(100)                 ,"
			+ " AT038AT            VARCHAR2(100)                 ,"
			+ " AT039AT            VARCHAR2(100)                 ,"
			+ " AT040AT            VARCHAR2(100)                 ,"
			+ " AT041AT            VARCHAR2(100)                 ,"
			+ " AT042AT            VARCHAR2(100)                 ,"
			+ " AT043AT            VARCHAR2(100)                 ,"
			+ " AT044AT            VARCHAR2(100)                 ,"
			+ " AT045AT            VARCHAR2(100)                 ,"
			+ " AT046AT            VARCHAR2(100)                 ,"
			+ " AT047AT            VARCHAR2(100)                 ,"
			+ " AT048AT            VARCHAR2(100)                 ,"
			+ " AT049AT            VARCHAR2(100)                 ,"
			+ " constraint EVOTYPES_PK primary key (AKEY)"
			+ " )";

	/**
	 * This defines a hierarchy
	 */
	public static final String EVOOBJECTS =
		" create table EVOOBJECTS"
			+ " ("
			+ " CKEY              INTEGER                not null,"
			+ " PKEY              INTEGER                not null,"
			+ " VALIDFROM         DATE                   not null,"
			+ " VALIDTO           DATE                   not null,"
			+ " LASTCHANGE        DATE                   not null,"
			+ " TYPE              VARCHAR2(1)            not null,"
			+ " VORDER            INTEGER                        ,"
			+ " constraint EVOOBJECTS_PK primary key (CKEY, PKEY, VALIDFROM)"
			+ " )";

	/**
	 * These are values of instance members
	 */
	public static final String EVOINSTANCES =
		" create table EVOINSTANCES"
			+ " ("
			+ " CKEY               INTEGER                not null,"
			+ " PKEY               INTEGER                not null,"
			+ " VALIDFROM          DATE                    not null,"
			+ " AT000AT            INTEGER                 ,"
			+ " AT001AT            INTEGER                 ,"
			+ " AT002AT            INTEGER                 ,"
			+ " AT003AT            INTEGER                 ,"
			+ " AT004AT            INTEGER                 ,"
			+ " AT005AT            INTEGER                 ,"
			+ " AT006AT            INTEGER                 ,"
			+ " AT007AT            INTEGER                 ,"
			+ " AT008AT            INTEGER                 ,"
			+ " AT009AT            INTEGER                 ,"
			+ " AT010AT            NUMBER(10,10)                 ,"
			+ " AT011AT            NUMBER(10,10)                 ,"
			+ " AT012AT            NUMBER(10,10)                 ,"
			+ " AT013AT            NUMBER(10,10)                 ,"
			+ " AT014AT            NUMBER(10,10)                 ,"
			+ " AT015AT            NUMBER(10,10)                 ,"
			+ " AT016AT            NUMBER(10,10)                 ,"
			+ " AT017AT            NUMBER(10,10)                 ,"
			+ " AT018AT            NUMBER(10,10)                 ,"
			+ " AT019AT            NUMBER(10,10)                 ,"
			+ " AT020AT            VARCHAR2(100)                 ,"
			+ " AT021AT            VARCHAR2(100)                 ,"
			+ " AT022AT            VARCHAR2(100)                 ,"
			+ " AT023AT            VARCHAR2(100)                 ,"
			+ " AT024AT            VARCHAR2(100)                 ,"
			+ " AT025AT            VARCHAR2(100)                 ,"
			+ " AT026AT            VARCHAR2(100)                 ,"
			+ " AT027AT            VARCHAR2(100)                 ,"
			+ " AT028AT            VARCHAR2(100)                 ,"
			+ " AT029AT            VARCHAR2(100)                 ,"
			+ " AT030AT            VARCHAR2(100)                 ,"
			+ " AT031AT            VARCHAR2(100)                 ,"
			+ " AT032AT            VARCHAR2(100)                 ,"
			+ " AT033AT            VARCHAR2(100)                 ,"
			+ " AT034AT            VARCHAR2(100)                 ,"
			+ " AT035AT            VARCHAR2(100)                 ,"
			+ " AT036AT            VARCHAR2(100)                 ,"
			+ " AT037AT            VARCHAR2(100)                 ,"
			+ " AT038AT            VARCHAR2(100)                 ,"
			+ " AT039AT            VARCHAR2(100)                 ,"
			+ " AT040AT            DATE                 ,"
			+ " AT041AT            DATE                 ,"
			+ " AT042AT            DATE                 ,"
			+ " AT043AT            DATE                 ,"
			+ " AT044AT            DATE                 ,"
			+ " AT045AT            DATE                 ,"
			+ " AT046AT            DATE                 ,"
			+ " AT047AT            DATE                 ,"
			+ " AT048AT            DATE                 ,"
			+ " AT049AT            DATE                 ,"
			+ " constraint EVOINSTANCES_FK foreign key (CKEY, PKEY, VALIDFROM) references EVOOBJECTS(CKEY, PKEY, VALIDFROM)"
			+ " )";

	/**
	 * This binds objects to types
	 */
	public static final String EVOOBJECTSTOTYPES =
		" create table EVOOBJECTSTOTYPES"
			+ " ("
			+ " AKEY              INTEGER                not null,"
			+ " PKEY              INTEGER                not null,"
			+ " CKEY              INTEGER                not null,"
			+ " VALIDFROM         DATE                   not null,"
			+ " VALIDTO           DATE                   not null,"
			+ " TYPE              INTEGER                not null,"
			+ " VLOCK             VARCHAR2(1)            not null,"
			+ " constraint EVOOBJECTSTOTYPES_UQ unique (CKEY, PKEY, VALIDFROM),"
			+ " constraint EVOOBJECTSTOTYPES_FK1 foreign key (AKEY) references EVOTYPES(AKEY),"
			+ " constraint EVOOBJECTSTOTYPES_FK2 foreign key (CKEY, PKEY, VALIDFROM) references EVOOBJECTS(CKEY, PKEY, VALIDFROM)"
			+ " )";

	public static final String EVOINDEX =
		"CREATE INDEX EVOBOINSTANCES_IND ON EVOINSTANCES(CKEY, AT000AT, AT001AT, AT010AT, AT011AT, AT020AT, AT021AT, AT022AT, AT023AT, AT040AT, AT041AT)";

	public void execute() throws BuildException {
		Connection conn = null;
		try {
			DriverManager.registerDriver(
				(Driver) Class
					.forName("oracle.jdbc.driver.OracleDriver")
					.newInstance());
			conn = DriverManager.getConnection(connect, name, password);

			Statement stm = conn.createStatement();

			StringTokenizer tokenizer =
				new StringTokenizer(creationKeywords, ",");
			while (tokenizer.hasMoreTokens()) {
				String keyword = tokenizer.nextToken();
				Field member = this.getClass().getDeclaredField(keyword.trim());
				stm.executeUpdate((String) member.get(null));
				System.out.println("Executed update for " + keyword);
			}
			conn.commit();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param string
	 */
	public void setConnect(String string) {
		connect = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setCreationKeywords(String string) {
		creationKeywords = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setName(String string) {
		name = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	private String connect; // jdbc:oracle:thin:@server:1521:sid
	private String name;
	private String password;
	private String creationKeywords;
}
