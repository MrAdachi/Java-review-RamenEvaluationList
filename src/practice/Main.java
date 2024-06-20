package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] arg) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("☆☆☆☆☆☆☆店舗評価アプリ☆☆☆☆☆☆☆");
		System.out.println("☆☆☆☆☆☆登録店舗は0件です☆☆☆☆☆☆");
		
		RamenList ramenList = new RamenList();
		
		int operation = 0;
		String storeName = null;
		String prefecture = null;
		int score = 0;
		String recommendMenu = null;
		int index = 0;
		
		// 操作
		while(true) {
			
			System.out.println("☆☆☆☆操作内容を選択してください☆☆☆☆");
			System.out.print("1.登録 / 2.編集 / 3.削除 / 4.終了 ＞ ");
			operation = Integer.parseInt(br.readLine());
			
			// 登録
			if (operation == 1) {
				System.out.print("評価する店舗を入力してください ＞ ");
				storeName = br.readLine();
				System.out.print("店舗の都道府県を入力してください ＞ ");
				prefecture = br.readLine();
				System.out.print("評価点を0～100点の間で入力してください ＞ ");
				score = Integer.parseInt(br.readLine());
				System.out.print("おすすめメニューを入力してください ＞ ");
				recommendMenu = br.readLine();
				
				ramenList.addItem(storeName, prefecture, score, recommendMenu);
				
				System.out.println("1件登録しました");
				
			// 変更
			} else if (operation == 2) {
				System.out.print("評価する店舗の番号を入力してください ＞ ");
				index = Integer.parseInt(br.readLine());
				System.out.print("店舗の都道府県を入力してください ＞ ");
				prefecture = br.readLine();
				System.out.print("評価点を0～100点の間で入力してください ＞ ");
				score = Integer.parseInt(br.readLine());
				System.out.print("おすすめメニューを入力してください ＞ ");
				recommendMenu = br.readLine();
				
				ramenList.changeItem(index, prefecture, score, recommendMenu);
				
				System.out.println("1件変更しました");
			
			// 削除
			} else if (operation == 3) {
				System.out.print("削除する店舗の番号を入力してください ＞ ");
				index = Integer.parseInt(br.readLine());
				
				ramenList.removeItem(index);
				
				System.out.println("1件削除しました");
				
			// アプリの終了（ループから抜ける）
			} else if (operation == 4) {
				break;
			}
			
			ramenList.displayItem();
			
			System.out.println();
		}
	}
}
