# Problems Include:

What's the Century: <br />

Given a year, return the century it is in. The first century spans 
from the year 1 up to and including the year 100, 
the second - from the year 101 up to and including 
the year 200, etc.

Apple Stock Picking: <br />

Writing programming interview questions hasn't made me rich yet ... so I might give up and start trading Apple stocks all day instead. 
<br />
First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day. 
<br />
So I grabbed Apple's stock prices from yesterday and put them in an array called stockPrices, where:<br />
	• The indices are the time (in minutes) past trade opening time, which was 9:30am local time.
<br />
	• The values are the price (in US dollars) of one share of Apple stock at that time. 
<br />
So if the stock cost $500 at 10:30am, that means stockPrices[60] = 500. <br />
Write an efficient method that takes stockPrices and returns the best profit I could have made from one purchase and one sale of one share of Apple stock yesterday. 
<br />
For example: 
<br />
  int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
getMaxProfit(stockPrices);
// returns 6 (buying for $5 and selling for $11)

<br />
No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the same time step—at least 1 minute has to pass.
