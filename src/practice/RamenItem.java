package practice;

import java.time.LocalDateTime;

public class RamenItem {
	
	// インスタンス変数の定義
	private String storeName;
	private String prefecture;
	private int score;
	private String recommendMenu;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	// コンストラクタ
	public RamenItem(String store_name, String prefecture, int score, String recommend_menu) {
		// 評価情報の登録
		this.storeName = store_name;
		this.prefecture = prefecture;
		this.score = score;
		this.recommendMenu = recommend_menu;
		this.createTime = LocalDateTime.now(); 
		this.updateTime = LocalDateTime.now(); 
	}

	// 情報更新
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

	public void setRecommendMenu(String recommendMenu) {
		this.recommendMenu = recommendMenu;
	}

	public void setUpdateTime() {
		this.updateTime = LocalDateTime.now(); 
	}

	// 情報取得
	public String getStoreName() {
		return storeName;
	}
	
	public String getPrefecture() {
		return prefecture;
	}
	
	public int getScore() {
		return score;
	}

	public String getRecommendMenu() {
		return recommendMenu;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}
}
