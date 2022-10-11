function check_numbers(x, y)
{
    if ((x >= 49 && x <= 100) || (y >= 49 && y <= 100))
    {
        return true;
    }
    else
    {
        return false;
    }
}
console.log(check_numbers(12, 101));