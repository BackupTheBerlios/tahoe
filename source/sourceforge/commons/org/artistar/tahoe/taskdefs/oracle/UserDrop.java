/** ** **
 *evologicsuppl
 *25.09.2003
 * 
 * @author Jacek Kempski
 * mailto:Jacek.Kempski@camline.com
 *
 * (c) Copyright 2003
 * 
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL camLine Datensysteme AG OR Jacek Kempski OR
 * THEIR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 ** ** **/
package org.artistar.tahoe.taskdefs.oracle;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/*
 * !! not checked in
 * ===========================
 * Changelog:
 * --------------------------------------
 * 25.09.2003				jacek			first creation
 */

/**<code>UserDrop</code>
 * <br>created on 25.09.2003
 * @author Jacek Kempski<br>
 * mailto:Jacek.Kempski@camline.com
 *
 * 
 */
public class UserDrop extends Task
{
	
	public void execute() throws BuildException{
		

			try
			{
				DriverManager.registerDriver((Driver) Class.forName("oracle.jdbc.driver.OracleDriver").newInstance());
				Connection conn = DriverManager.getConnection(connect, dbauser, dbapassword);
				
				String dropStmt =
					new StringBuffer()
						.append("DROP USER ")
						.append(name)
						.append(cascade?" CASCADE":"")
						.toString();
			
				Statement stm = conn.createStatement();
				stm.executeUpdate(dropStmt);
				stm.close();
				conn.close();
				
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}

	/**
	 * 
	 * @param string
	 */
	public void setConnect(String string)
	{
		connect = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setDbapassword(String string)
	{
		dbapassword = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setDbauser(String string)
	{
		dbauser = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setName(String string)
	{
		name = string;
	}

	/**
	 * 
	 * @param string
	 */
	public void setPassword(String string)
	{
		password = string;
	}

	/**
	 * 
	 * @param b
	 */
	public void setCascade(boolean b)
	{
		cascade = b;
	}

	private String connect; // jdbc:oracle:thin:@server:1521:sid
	private String name;
	private String password;
	private String dbauser;
	private String dbapassword;
	private boolean cascade;
}
