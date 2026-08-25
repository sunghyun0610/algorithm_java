# [level 2] [3차] 압축 - 17684 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17684) 

### 성능 요약

메모리: 84.3 MB, 시간: 0.75 ms

### 구분

코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 08월 25일 18:03:48

### 문제 설명

<h2 style="user-select: auto !important;">압축</h2>

<p style="user-select: auto !important;">신입사원 어피치는 카카오톡으로 전송되는 메시지를 압축하여 전송 효율을 높이는 업무를 맡게 되었다. 메시지를 압축하더라도 전달되는 정보가 바뀌어서는 안 되므로, 압축 전의 정보를 완벽하게 복원 가능한 무손실 압축 알고리즘을 구현하기로 했다.</p>

<p style="user-select: auto !important;">어피치는 여러 압축 알고리즘 중에서 성능이 좋고 구현이 간단한 <strong style="user-select: auto !important;">LZW</strong>(Lempel–Ziv–Welch) 압축을 구현하기로 했다. LZW 압축은 1983년 발표된 알고리즘으로, 이미지 파일 포맷인 GIF 등 다양한 응용에서 사용되었다.</p>

<p style="user-select: auto !important;">LZW&nbsp;압축은 다음 과정을 거친다.</p>

<ol style="user-select: auto !important;">
<li style="user-select: auto !important;">길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.</li>
<li style="user-select: auto !important;">사전에서 현재 입력과 일치하는 가장 긴 문자열 <code style="user-select: auto !important;">w</code>를 찾는다.</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">w</code>에 해당하는 사전의 색인 번호를 출력하고, 입력에서 <code style="user-select: auto !important;">w</code>를 제거한다.</li>
<li style="user-select: auto !important;">입력에서 처리되지 않은 다음 글자가 남아있다면(<code style="user-select: auto !important;">c</code>), <code style="user-select: auto !important;">w+c</code>에 해당하는 단어를 사전에 등록한다.</li>
<li style="user-select: auto !important;">단계 2로 돌아간다.</li>
</ol>

<p style="user-select: auto !important;">압축 알고리즘이 영문 대문자만 처리한다고 할 때, 사전은 다음과 같이 초기화된다. 사전의 색인 번호는 정수값으로 주어지며, 1부터 시작한다고 하자.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">색인 번호</th>
<th style="user-select: auto !important;">1</th>
<th style="user-select: auto !important;">2</th>
<th style="user-select: auto !important;">3</th>
<th style="user-select: auto !important;">...</th>
<th style="user-select: auto !important;">24</th>
<th style="user-select: auto !important;">25</th>
<th style="user-select: auto !important;">26</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">단어</td>
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">C</td>
<td style="user-select: auto !important;">...</td>
<td style="user-select: auto !important;">X</td>
<td style="user-select: auto !important;">Y</td>
<td style="user-select: auto !important;">Z</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">예를 들어 입력으로 <code style="user-select: auto !important;">KAKAO</code>가 들어온다고 하자.</p>

<ol style="user-select: auto !important;">
<li style="user-select: auto !important;">현재 사전에는 <code style="user-select: auto !important;">KAKAO</code>의 첫 글자 <code style="user-select: auto !important;">K</code>는 등록되어 있으나, 두 번째 글자까지인 <code style="user-select: auto !important;">KA</code>는 없으므로, 첫 글자 <code style="user-select: auto !important;">K</code>에 해당하는 색인 번호 11을 출력하고, 다음 글자인 <code style="user-select: auto !important;">A</code>를 포함한 <code style="user-select: auto !important;">KA</code>를 사전에 27 번째로 등록한다.</li>
<li style="user-select: auto !important;">두 번째 글자 <code style="user-select: auto !important;">A</code>는 사전에 있으나, 세 번째 글자까지인 <code style="user-select: auto !important;">AK</code>는 사전에 없으므로, <code style="user-select: auto !important;">A</code>의  색인 번호 1을 출력하고, <code style="user-select: auto !important;">AK</code>를 사전에 28 번째로 등록한다.</li>
<li style="user-select: auto !important;">세 번째 글자에서 시작하는 <code style="user-select: auto !important;">KA</code>가 사전에 있으므로, <code style="user-select: auto !important;">KA</code>에 해당하는 색인 번호 27을 출력하고, 다음 글자 <code style="user-select: auto !important;">O</code>를 포함한 <code style="user-select: auto !important;">KAO</code>를 29 번째로 등록한다.</li>
<li style="user-select: auto !important;">마지막으로 처리되지 않은 글자 <code style="user-select: auto !important;">O</code>에 해당하는 색인 번호 15를 출력한다.</li>
</ol>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">현재 입력(w)</th>
<th style="user-select: auto !important;">다음 글자(c)</th>
<th style="user-select: auto !important;">출력</th>
<th style="user-select: auto !important;">사전 추가(w+c)</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">K</td>
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">27: KA</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">A</td>
<td style="user-select: auto !important;">K</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">28: AK</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">KA</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">27</td>
<td style="user-select: auto !important;">29: KAO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;"></td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;"></td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">이 과정을 거쳐 다섯 글자의 문장 <code style="user-select: auto !important;">KAKAO</code>가 4개의 색인 번호 [11, 1, 27, 15]로 압축된다.</p>

<p style="user-select: auto !important;">입력으로 <code style="user-select: auto !important;">TOBEORNOTTOBEORTOBEORNOT</code>가 들어오면 다음과 같이 압축이 진행된다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">현재 입력(w)</th>
<th style="user-select: auto !important;">다음 글자(c)</th>
<th style="user-select: auto !important;">출력</th>
<th style="user-select: auto !important;">사전 추가(w+c)</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">T</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">20</td>
<td style="user-select: auto !important;">27: TO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">28: OB</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">E</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">29: BE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">E</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">30: EO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">R</td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">31: OR</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">R</td>
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">18</td>
<td style="user-select: auto !important;">32: RN</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">N</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">33: NO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">T</td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">34: OT</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">T</td>
<td style="user-select: auto !important;">T</td>
<td style="user-select: auto !important;">20</td>
<td style="user-select: auto !important;">35: TT</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TO</td>
<td style="user-select: auto !important;">B</td>
<td style="user-select: auto !important;">27</td>
<td style="user-select: auto !important;">36: TOB</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">BE</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">29</td>
<td style="user-select: auto !important;">37: BEO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">OR</td>
<td style="user-select: auto !important;">T</td>
<td style="user-select: auto !important;">31</td>
<td style="user-select: auto !important;">38: ORT</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">TOB</td>
<td style="user-select: auto !important;">E</td>
<td style="user-select: auto !important;">36</td>
<td style="user-select: auto !important;">39: TOBE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">EO</td>
<td style="user-select: auto !important;">R</td>
<td style="user-select: auto !important;">30</td>
<td style="user-select: auto !important;">40: EOR</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">RN</td>
<td style="user-select: auto !important;">O</td>
<td style="user-select: auto !important;">32</td>
<td style="user-select: auto !important;">41: RNO</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">OT</td>
<td style="user-select: auto !important;"></td>
<td style="user-select: auto !important;">34</td>
<td style="user-select: auto !important;"></td>
</tr>
</tbody>
      </table>
<h3 style="user-select: auto !important;">입력 형식</h3>

<p style="user-select: auto !important;">입력으로 영문 대문자로만 이뤄진 문자열 <code style="user-select: auto !important;">msg</code>가 주어진다. <code style="user-select: auto !important;">msg</code>의 길이는 1 글자 이상, 1000 글자 이하이다.</p>

<h3 style="user-select: auto !important;">출력 형식</h3>

<p style="user-select: auto !important;">주어진 문자열을 압축한 후의 사전 색인 번호를 배열로 출력하라.</p>

<h3 style="user-select: auto !important;">입출력 예제</h3>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">msg</th>
<th style="user-select: auto !important;">answer</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">KAKAO</code></td>
<td style="user-select: auto !important;">[11, 1, 27, 15]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">TOBEORNOTTOBEORTOBEORNOT</code></td>
<td style="user-select: auto !important;">[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;"><code style="user-select: auto !important;">ABABABABABABABAB</code></td>
<td style="user-select: auto !important;">[1, 2, 27, 29, 28, 31, 30]</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;"><a href="http://tech.kakao.com/2017/11/14/kakao-blind-recruitment-round-3/" target="_blank" rel="noopener" style="user-select: auto !important;">해설 보러가기</a></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges