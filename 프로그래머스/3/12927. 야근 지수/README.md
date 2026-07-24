# [level 3] 야근 지수 - 12927 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12927) 

### 성능 요약

메모리: 73.5 MB, 시간: 61.04 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 86.7<br/>효율성: 13.3<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 07월 24일 13:56:40

### 문제 설명

<p style="user-select: auto !important;">회사원 Demi는 가끔은 야근을 하는데요, 야근을 하면 야근 피로도가 쌓입니다. 야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다. Demi는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다.Demi가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때,  퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 함수 solution을 완성해주세요.</p>

<h5 style="user-select: auto !important;">제한 사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">works</code>는 길이 1 이상, 20,000 이하인 배열입니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">works</code>의 원소는 50000 이하인 자연수입니다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">n</code>은 1,000,000 이하인 자연수입니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">works</th>
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[4, 3, 3]</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">12</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 1, 2]</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">6</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[1,1]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">0</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1<br style="user-select: auto !important;">
n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다. 이 때 야근 지수는 2<sup style="user-select: auto !important;">2</sup> + 2<sup style="user-select: auto !important;">2</sup> + 2<sup style="user-select: auto !important;">2</sup> = 12 입니다.</p>

<p style="user-select: auto !important;">입출력 예 #2<br style="user-select: auto !important;">
n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다. 야근지수는 1<sup style="user-select: auto !important;">2</sup> + 1<sup style="user-select: auto !important;">2</sup> + 2<sup style="user-select: auto !important;">2</sup> = 6입니다.</p>

<p style="user-select: auto !important;">입출력 예 #3</p>

<p style="user-select: auto !important;">남은 작업량이 없으므로 피로도는 0입니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges