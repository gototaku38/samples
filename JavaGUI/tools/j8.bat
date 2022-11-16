rem j8.bat
rem コードページ932(ANSI/OEM-日本語Shift-JIS)のコマンドプロンプトで
rem UTF-8のJavaソースファイルをコンパイルして実行するためのバッチファイル

java -Dfile.encoding=utf-8 %1