package jrout.tutorial.jdbc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jrout.tutorial.jdbc.JDBCMavenProgram;

public class JDBCMavenProgramTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void selectQueryTest() {
		JDBCMavenProgram mavenProgram = new JDBCMavenProgram();
		mavenProgram.selectQuery();
	}

}
