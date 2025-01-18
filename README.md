# AtCoderのコード記録用リポジトリです
## 配列に1文字ずつ格納する
```
// "abc"という文字列
String str = "abc";
// まずstrArraySubに1文字多い配列を作る
String[] strArray = new String[str.length()];
 
// 変数strの長さ分回す
for (int i = 0; i < str.length(); i++) {
    // strの先頭から1文字ずつString型にして取り出す
    String str2 = String.valueOf(str.charAt(i));
    // 配列に順番に格納する
    strArray[i] = str2;
}
```

## 文字列を数字に置換
```
int num = Integer.parseInt(str);
```