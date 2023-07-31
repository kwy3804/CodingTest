List<int> assignmentList = Enumerable.Range(1, 30).ToList();

for (int i = 0; i < 28; i++)
{
    int n = int.Parse(Console.ReadLine());
    assignmentList.Remove(n);
}

assignmentList.Sort();
Console.WriteLine(assignmentList[0]);
Console.WriteLine(assignmentList[1]);