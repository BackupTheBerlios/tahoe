/*
 * E V O L O G I C
 *
 * Evologic is Copyright (c) 2003 Artistar Software Ltd., London, UK
 * Original code is written or introduced by Jacek Kempski
 */
package org.artistar.tahoe.main;

import org.artistar.tahoe.taskdefs.oracle.SchemaCreate;

/**
 * @author jacek
 * @09.10.2003
 * @evologic
 */

public class CrebasExec {

	public static void main(String[] args) {
		
		if(args.length != 3){
			System.out.println("Usage CrebasExec url username password");
			System.exit(1);
		}
		String connectUrl = args[0];
		String user = args[1];
		String password = args[2];
		SchemaCreate sc = new SchemaCreate();
		sc.setConnect(connectUrl);
		sc.setName(user);
		sc.setPassword(password);
		sc.setCreationKeywords(
			new StringBuffer()
				.append("EVOTYPES")
				.append(",")
				.append("EVOOBJECTS")
				.append(",")
				.append("EVOINSTANCES")
				.append(",")
				.append("EVOOBJECTSTOTYPES")
				.append(",")
				.append("EVOINDEX")
				.toString());
		sc.execute();
	}
}
