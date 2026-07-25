# [level 3] 징검다리 건너기 - 64062 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/64062) 

### 성능 요약

메모리: 67.7 MB, 시간: 44.55 ms

### 구분

코딩테스트 연습 > 2019 카카오 개발자 겨울 인턴십

### 채점결과

정확성: 64.1<br/>효율성: 35.9<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 07월 25일 13:59:27

### 문제 설명

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">[본 문제는 정확성과 효율성 테스트 각각 점수가 있는 문제입니다.]</strong></p>

<p style="user-select: auto !important;">카카오 초등학교의 "니니즈 친구들"이 "라이언" 선생님과 함께 가을 소풍을 가는 중에 <strong style="user-select: auto !important;">징검다리</strong>가 있는 개울을 만나서 건너편으로 건너려고 합니다. "라이언" 선생님은 "니니즈 친구들"이 무사히 징검다리를 건널 수 있도록 다음과 같이 규칙을 만들었습니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">징검다리는 일렬로 놓여 있고 각 징검다리의 디딤돌에는 모두 숫자가 적혀 있으며 디딤돌의 숫자는 한 번 밟을 때마다 1씩 줄어듭니다.</li>
<li style="user-select: auto !important;">디딤돌의 숫자가 0이 되면 더 이상 밟을 수 없으며 이때는 그 다음 디딤돌로 한번에 여러 칸을 건너 뛸 수 있습니다.</li>
<li style="user-select: auto !important;">단, 다음으로 밟을 수 있는 디딤돌이 여러 개인 경우 무조건 가장 가까운 디딤돌로만 건너뛸 수 있습니다.</li>
</ul>

<p style="user-select: auto !important;">"니니즈 친구들"은 개울의 왼쪽에 있으며, 개울의 오른쪽 건너편에 도착해야 징검다리를 건넌 것으로 인정합니다.<br style="user-select: auto !important;">
"니니즈 친구들"은 한 번에 한 명씩 징검다리를 건너야 하며, 한 친구가 징검다리를 모두 건넌 후에 그 다음 친구가 건너기 시작합니다.</p>

<p style="user-select: auto !important;">디딤돌에 적힌 숫자가 순서대로 담긴 배열 stones와 한 번에 건너뛸 수 있는 디딤돌의 최대 칸수 k가 매개변수로 주어질 때, 최대 몇 명까지 징검다리를 건널 수 있는지 return 하도록 solution 함수를 완성해주세요.</p>

<h4 style="user-select: auto !important;"><strong style="user-select: auto !important;">[제한사항]</strong></h4>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">징검다리를 건너야 하는 니니즈 친구들의 수는 무제한 이라고 간주합니다.</li>
<li style="user-select: auto !important;">stones 배열의 크기는 1 이상 200,000 이하입니다.</li>
<li style="user-select: auto !important;">stones 배열 각 원소들의 값은 1 이상 200,000,000 이하인 자연수입니다.</li>
<li style="user-select: auto !important;">k는 1 이상 stones의 길이 이하인 자연수입니다.</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;"><strong style="user-select: auto !important;">[입출력 예]</strong></h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">stones</th>
<th style="user-select: auto !important;">k</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 4, 5, 3, 2, 1, 4, 2, 5, 1]</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">3</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예에 대한 설명</strong></h5>

<hr style="user-select: auto !important;">

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예 #1</strong></p>

<p style="user-select: auto !important;">첫 번째 친구는 다음과 같이 징검다리를 건널 수 있습니다.<br style="user-select: auto !important;">
<img src="https://asset.programmers.co.kr/files/production/4560e242-cf83-4e77-a14c-174f3831499d/step_stones_104.png" title="" alt="step_stones_104.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">첫 번째 친구가 징검다리를 건넌 후 디딤돌에 적힌 숫자는 아래 그림과 같습니다.<br style="user-select: auto !important;">
두 번째 친구도 아래 그림과 같이 징검다리를 건널 수 있습니다.<br style="user-select: auto !important;">
<img src="https://asset.programmers.co.kr/files/production/d64f29ac-3e35-4fd3-91fa-4d70e3b6c80a/step_stones_101.png" title="" alt="step_stones_101.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">두 번째 친구가 징검다리를 건넌 후 디딤돌에 적힌 숫자는 아래 그림과 같습니다.<br style="user-select: auto !important;">
세 번째 친구도 아래 그림과 같이 징검다리를 건널 수 있습니다.<br style="user-select: auto !important;">
<img src="https://asset.programmers.co.kr/files/production/369bc8a1-7017-4135-a499-505247ab9cfc/step_stones_102.png" title="" alt="step_stones_102.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">세 번째 친구가 징검다리를 건넌 후 디딤돌에 적힌 숫자는 아래 그림과 같습니다. <br style="user-select: auto !important;">
네 번째 친구가 징검다리를 건너려면, 세 번째 디딤돌에서 일곱 번째 디딤돌로 네 칸을 건너뛰어야 합니다. 하지만 k = 3 이므로 건너뛸 수 없습니다.<br style="user-select: auto !important;">
<img src="https://asset.programmers.co.kr/files/production/e44e0a83-e637-48ad-858c-4c135c3b078f/step_stones_103.png" title="" alt="step_stones_103.png" style="user-select: auto !important;"></p>

<p style="user-select: auto !important;">따라서 최대 3명이 디딤돌을 모두 건널 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges