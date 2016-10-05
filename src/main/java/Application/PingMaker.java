package Application;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class PingMaker extends TimerTask {

	private boolean isRunning;
	private Timer timer;
	private ArrayList<Ping> pings;

	public void startExecution() throws IOException, InterruptedException {
		if (isRunning == false) {
			isRunning = true;
			timer = new Timer();
			timer.scheduleAtFixedRate(this, 1000, 2000);
		}
	}

	@Override
	public void run() {
		System.out.println("começou a rodar");
		makePing("www.google.com");
	}

	private void finishExecution() {
		this.isRunning = false;
		timer.cancel();
	}

	private static long makePing(String hostname) {
		long beforePing = System.currentTimeMillis();
		boolean isPinged = false;
		try {
			isPinged = InetAddress.getByName(hostname).isReachable(3000);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 2 seconds
		long currentTime = System.currentTimeMillis() - beforePing;
		if (isPinged) {
			System.out.println("pinged successfully in " + currentTime + "millisecond");
			return currentTime;
		} else {
			System.out.println("Ping failed.");
			return Long.MAX_VALUE;
		}
	}

}
