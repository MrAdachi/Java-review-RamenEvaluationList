package practice;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RamenList {
	
	List<RamenItem> RamenItems;
	
	// コンストラクタ
	public RamenList() {
		// Listのインスタンス生成
		this.RamenItems = new ArrayList<RamenItem>();
	}
	
	// 登録
	public void addItem(String store_name, String prefecture, int score, String recommend_menu) {
		RamenItem ramenitem = new RamenItem(store_name, prefecture, score, recommend_menu);
		RamenItems.add(ramenitem);
	}
	
	// 変更
	public void changeItem(int index, String prefecture, int score, String recommend_menu) {
		RamenItem changeramenitem = RamenItems.get(index);
		changeramenitem.setPrefecture(prefecture);
		changeramenitem.setScore(score);
		changeramenitem.setRecommend_menu(recommend_menu);
		changeramenitem.setUpdate_time();
	}
	
	// 削除
	public void removeItem(int index) {
		RamenItems.remove(index);
	}
	
	// 表示
	public void displayItem() {
		
		// ListのSort
		for(int i = 0; i < RamenItems.size() - 1; i++) {
			for(int j = 0; j < RamenItems.size() -1 - i; j++) {
				
				if(RamenItems.get(j).getScore() < RamenItems.get(j+1).getScore()) {
					
					RamenItem temporary = RamenItems.get(j);
					RamenItems.set(j, RamenItems.get(j+1));
					RamenItems.set(j+1, temporary);
				}
			}
		}
		
		int count = 0;
		
		for(RamenItem ramenitem : RamenItems) {
			// フォーマットの指定
			DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			System.out.println(count + "・・・　店舗名：" + ramenitem.getStoreName() + "　都道府県：" + ramenitem.getPrefecture() + "　評価点：" + ramenitem.getScore() + "点　おすすめメニュー：" + ramenitem.getRecommend_menu());
			System.out.println("　　　　 登録日時：" + ramenitem.getAdd_time().format(f) + "　更新日時：" + ramenitem.getUpdate_time().format(f));
			count ++;
		}
	}
}
