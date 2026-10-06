# [level 2] 최댓값과 최솟값 - 12939 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12939) 

### 성능 요약

메모리: 83.6 MB, 시간: 0.42 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 10월 06일 20:55:56

### 문제 설명

<p style="user-select: auto !important;">문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.<br style="user-select: auto !important;">
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.</p>

<h5 style="user-select: auto !important;">제한 조건</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">s</th>
<th style="text-align: center; user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"1 2 3 4"</td>
<td style="text-align: center; user-select: auto !important;">"1 4"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"-1 -2 -3 -4"</td>
<td style="text-align: center; user-select: auto !important;">"-4 -1"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"-1 -1"</td>
<td style="text-align: center; user-select: auto !important;">"-1 -1"</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges