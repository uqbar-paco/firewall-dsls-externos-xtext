package ar.edu.tadp.firewall;

import ar.edu.tadp.firewall.examples.MiFirewallLoco;

public class FirewallMainTestCaseManagerObject {

	public static void main(String[] args) {
		Firewall firewall = new MiFirewallLoco();
		firewall.receive(new Request("192.168.1.130", 3893, "192.168.1.1", 8888));
		firewall.receive(new Request("192.168.1.130", 1111, "192.168.1.1", 8888));
		firewall.receive(new Request("10.0.2.1", 3893, "192.168.1.222", 8080));
		firewall.receive(new Request("10.0.2.1", 3893, "192.168.1.222", 8081));
	}
}
