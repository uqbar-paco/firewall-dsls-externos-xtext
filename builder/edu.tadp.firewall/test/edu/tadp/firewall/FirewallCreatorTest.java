package edu.tadp.firewall;

import org.junit.Test;

import ar.edu.tadp.firewall.Firewall;
import ar.edu.tadp.firewall.MockHandler;
import ar.edu.tadp.firewall.Request;

public class FirewallCreatorTest {

	@Test
	public void testCreateFirewall() {
		MockHandler mockHandler = new MockHandler();
		Firewall aFirewall = FirewallCreator.createFirewall(
				"aFirewall.firewall", mockHandler, mockHandler);

		Request requestAceptado = new Request("192.168.1.30", 80, "200.3.3.3",
				3);
		aFirewall.receive(requestAceptado);

		Request requestBloqueado = new Request("192.168.1.200", 20,
				"192.168.1.1", 33);

		aFirewall.receive(requestBloqueado);
		
		mockHandler.assertAceptado(requestAceptado);
		mockHandler.assertBloqueado(requestBloqueado);
	}

}
