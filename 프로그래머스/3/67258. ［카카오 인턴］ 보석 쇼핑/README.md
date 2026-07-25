# [level 3] [카카오 인턴] 보석 쇼핑 - 67258 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/67258) 

### 성능 요약

메모리: 83.4 MB, 시간: 27.77 ms

### 구분

코딩테스트 연습 > 2020 카카오 인턴십

### 채점결과

정확성: 33.3<br/>효율성: 66.7<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 07월 25일 10:13:06

### 문제 설명

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">[본 문제는 정확성과 효율성 테스트 각각 점수가 있는 문제입니다.]</strong></p>

<p style="user-select: auto !important;">개발자 출신으로 세계 최고의 갑부가 된 <code style="user-select: auto !important;">어피치</code>는 스트레스를 받을 때면 이를 풀기 위해 오프라인 매장에 쇼핑을 하러 가곤 합니다.<br style="user-select: auto !important;">
어피치는 쇼핑을 할 때면 매장 진열대의 특정 범위의 물건들을 모두 싹쓸이 구매하는 습관이 있습니다.<br style="user-select: auto !important;">
어느 날 스트레스를 풀기 위해 보석 매장에 쇼핑을 하러 간 어피치는 이전처럼 진열대의 특정 범위의 보석을 모두 구매하되 특별히 아래 목적을 달성하고 싶었습니다.<br style="user-select: auto !important;">
<code style="user-select: auto !important;">진열된 모든 종류의 보석을 적어도 1개 이상 포함하는 가장 짧은 구간을 찾아서 구매</code></p>

<p style="user-select: auto !important;">예를 들어 아래 진열대는 4종류의 보석(RUBY, DIA, EMERALD, SAPPHIRE) 8개가 진열된 예시입니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">진열대 번호</th>
<th style="user-select: auto !important;">1</th>
<th style="user-select: auto !important;">2</th>
<th style="user-select: auto !important;">3</th>
<th style="user-select: auto !important;">4</th>
<th style="user-select: auto !important;">5</th>
<th style="user-select: auto !important;">6</th>
<th style="user-select: auto !important;">7</th>
<th style="user-select: auto !important;">8</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">보석 이름</td>
<td style="user-select: auto !important;">DIA</td>
<td style="user-select: auto !important;">RUBY</td>
<td style="user-select: auto !important;"><strong style="user-select: auto !important;">RUBY</strong></td>
<td style="user-select: auto !important;"><strong style="user-select: auto !important;">DIA</strong></td>
<td style="user-select: auto !important;"><strong style="user-select: auto !important;">DIA</strong></td>
<td style="user-select: auto !important;"><strong style="user-select: auto !important;">EMERALD</strong></td>
<td style="user-select: auto !important;"><strong style="user-select: auto !important;">SAPPHIRE</strong></td>
<td style="user-select: auto !important;">DIA</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">진열대의 3번부터 7번까지 5개의 보석을 구매하면 모든 종류의 보석을 적어도 하나 이상씩 포함하게 됩니다.  </p>

<p style="user-select: auto !important;">진열대의 3, 4, 6, 7번의 보석만 구매하는 것은 중간에 특정 구간(5번)이 빠지게 되므로 어피치의 쇼핑 습관에 맞지 않습니다.</p>

<p style="user-select: auto !important;">진열대 번호 순서대로 보석들의 이름이 저장된 배열 gems가 매개변수로 주어집니다. 이때 모든 보석을 하나 이상 포함하는 가장 짧은 구간을 찾아서 return 하도록 solution 함수를 완성해주세요.<br style="user-select: auto !important;">
가장 짧은 구간의 <code style="user-select: auto !important;">시작 진열대 번호</code>와 <code style="user-select: auto !important;">끝 진열대 번호</code>를 차례대로 배열에 담아서 return 하도록 하며, 만약 가장 짧은 구간이 여러 개라면 <code style="user-select: auto !important;">시작 진열대 번호</code>가 가장 작은 구간을 return 합니다.</p>

<h5 style="user-select: auto !important;"><strong style="user-select: auto !important;">[제한사항]</strong></h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">gems 배열의 크기는 1 이상 100,000 이하입니다.

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">gems 배열의 각 원소는 진열대에 나열된 보석을 나타냅니다.</li>
<li style="user-select: auto !important;">gems 배열에는 1번 진열대부터 진열대 번호 순서대로 보석이름이 차례대로 저장되어 있습니다.</li>
<li style="user-select: auto !important;">gems 배열의 각 원소는 길이가 1 이상 10 이하인 알파벳 대문자로만 구성된 문자열입니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예</strong></h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">gems</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"]</code></td>
<td style="user-select: auto !important;">[3, 7]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">["AA", "AB", "AC", "AA", "AC"]</code></td>
<td style="user-select: auto !important;">[1, 3]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">["XYZ", "XYZ", "XYZ"]</code></td>
<td style="user-select: auto !important;">[1, 1]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">["ZZZ", "YYY", "NNNN", "YYY", "BBB"]</code></td>
<td style="user-select: auto !important;">[1, 5]</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예에 대한 설명</strong></h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong><br style="user-select: auto !important;">
문제 예시와 같습니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong><br style="user-select: auto !important;">
3종류의 보석(AA, AB, AC)을 모두 포함하는 가장 짧은 구간은 [1, 3], [2, 4]가 있습니다. <br style="user-select: auto !important;">
<code style="user-select: auto !important;">시작 진열대 번호</code>가 더 작은 [1, 3]을 return 해주어야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #3</strong><br style="user-select: auto !important;">
1종류의 보석(XYZ)을 포함하는 가장 짧은 구간은 [1, 1], [2, 2], [3, 3]이 있습니다. <br style="user-select: auto !important;">
<code style="user-select: auto !important;">시작 진열대 번호</code>가 가장 작은 [1, 1]을 return 해주어야 합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #4</strong><br style="user-select: auto !important;">
4종류의 보석(ZZZ, YYY, NNNN, BBB)을 모두 포함하는 구간은 [1, 5]가 유일합니다.<br style="user-select: auto !important;">
그러므로 [1, 5]를 return 해주어야 합니다.</p>

<p style="user-select: auto !important;">※ 공지 - 2020년 7월 21일 테스트케이스가 추가되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges