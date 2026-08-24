# [level 1] [PCCP 기출문제] 1번 / 동영상 재생기 - 340213 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/340213) 

### 성능 요약

메모리: 73.7 MB, 시간: 0.13 ms

### 구분

코딩테스트 연습 > PCCP 기출문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 24일 09:06:57

### 문제 설명

<p style="user-select: auto !important;">당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.</li>
<li style="user-select: auto !important;">10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.</li>
<li style="user-select: auto !important;">오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(<code style="user-select: auto !important;">op_start</code> ≤ 현재 재생 위치 ≤ <code style="user-select: auto !important;">op_end</code>)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.</li>
</ul>

<p style="user-select: auto !important;">동영상의 길이를 나타내는 문자열 <code style="user-select: auto !important;">video_len</code>, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 <code style="user-select: auto !important;">pos</code>, 오프닝 시작 시각을 나타내는 문자열 <code style="user-select: auto !important;">op_start</code>, 오프닝이 끝나는 시각을 나타내는 문자열 <code style="user-select: auto !important;">op_end</code>, 사용자의 입력을 나타내는 1차원 문자열 배열 <code style="user-select: auto !important;">commands</code>가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "<code style="user-select: auto !important;">mm</code>:<code style="user-select: auto !important;">ss</code>" 형식으로 return 하도록 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">video_len</code>의 길이 = <code style="user-select: auto !important;">pos</code>의 길이 = <code style="user-select: auto !important;">op_start</code>의 길이 = <code style="user-select: auto !important;">op_end</code>의 길이 = 5

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">video_len</code>, <code style="user-select: auto !important;">pos</code>, <code style="user-select: auto !important;">op_start</code>, <code style="user-select: auto !important;">op_end</code>는 "<code style="user-select: auto !important;">mm</code>:<code style="user-select: auto !important;">ss</code>" 형식으로 <code style="user-select: auto !important;">mm</code>분 <code style="user-select: auto !important;">ss</code>초를 나타냅니다.</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">mm</code> ≤ 59</li>
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">ss</code> ≤ 59</li>
<li style="user-select: auto !important;">분, 초가 한 자리일 경우 0을 붙여 두 자리로 나타냅니다.</li>
<li style="user-select: auto !important;">비디오의 현재 위치 혹은 오프닝이 끝나는 시각이 동영상의 범위 밖인 경우는 주어지지 않습니다.</li>
<li style="user-select: auto !important;">오프닝이 시작하는 시각은 항상 오프닝이 끝나는 시각보다 전입니다.</li>
</ul></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">commands</code>의 길이 ≤ 100

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">commands</code>의 원소는 "prev" 혹은 "next"입니다.</li>
<li style="user-select: auto !important;">"prev"는 10초 전으로 이동하는 명령입니다.</li>
<li style="user-select: auto !important;">"next"는 10초 후로 이동하는 명령입니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">video_len</th>
<th style="user-select: auto !important;">pos</th>
<th style="user-select: auto !important;">op_start</th>
<th style="user-select: auto !important;">op_end</th>
<th style="user-select: auto !important;">commands</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"34:33"</td>
<td style="user-select: auto !important;">"13:00"</td>
<td style="user-select: auto !important;">"00:55"</td>
<td style="user-select: auto !important;">"02:55"</td>
<td style="user-select: auto !important;">["next", "prev"]</td>
<td style="user-select: auto !important;">"13:00"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"10:55"</td>
<td style="user-select: auto !important;">"00:05"</td>
<td style="user-select: auto !important;">"00:15"</td>
<td style="user-select: auto !important;">"06:55"</td>
<td style="user-select: auto !important;">["prev", "next", "next"]</td>
<td style="user-select: auto !important;">"06:55"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"07:22"</td>
<td style="user-select: auto !important;">"04:05"</td>
<td style="user-select: auto !important;">"00:15"</td>
<td style="user-select: auto !important;">"04:07"</td>
<td style="user-select: auto !important;">["next"]</td>
<td style="user-select: auto !important;">"04:17"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">시작 위치 13분 0초에서 10초 후로 이동하면 13분 10초입니다.</li>
<li style="user-select: auto !important;">13분 10초에서 10초 전으로 이동하면 13분 0초입니다.</li>
<li style="user-select: auto !important;">따라서 "13:00"을 return 하면 됩니다.</li>
</ul>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #2</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">시작 위치 0분 5초에서 10초 전으로 이동합니다. 현재 위치가 10초 미만이기 때문에 0분 0초로 이동합니다.</li>
<li style="user-select: auto !important;">0분 0초에서 10초 후로 이동하면 0분 10초입니다.</li>
<li style="user-select: auto !important;">0분 10초에서 10초 후로 이동하면 0분 20초입니다. 0분 20초는 오프닝 구간이기 때문에 오프닝이 끝나는 위치인 6분 55초로 이동합니다. 따라서 "06:55"를 return 하면 됩니다.</li>
</ul>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #3</strong></p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">시작 위치 4분 5초는 오프닝 구간이기 때문에 오프닝이 끝나는 위치인 4분 7초로 이동합니다. 4분 7초에서 10초 후로 이동하면 4분 17초입니다. 따라서 "04:17"을 return 하면 됩니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges