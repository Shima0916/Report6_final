# ルール (数字あてゲーム ヌメロン)
あなたは、コンピュータの考えた3桁の数字を当てます。
数字は、０～９の中から３つの数字を使っています。同じ数字は使っていません。
あなたがコールした数字に対して、コンピュータはEAT(イート)とBITE(バイト)の数を答えます。
・EAT（イート）・・・数値と位が合っている場合
・BITE（バイト）・・・数値だけが合っており、位は違っている場合
例えば、コンピュータが思い浮かべた数字が「258」で、あなたがコールした数字が「289」ならば、
「2」が数字も位も合っていて、「8」は数字だけ合っているため、
1E(イート)-1B(バイト)となります。
これを繰り返し、３桁の数字を当てたら、ゲーム終了です。
