int count = int.Parse(Console.ReadLine());
int[] score = Console.ReadLine().Split().Select(int.Parse).ToArray();
int maxScore = score.Max();

float totalScore = score.Sum(number => number / (float)maxScore * 100.0f);

Console.WriteLine(totalScore / count);