#include<iostream>
int a,n,m,k,p;
int main(){
std::cin>>n>>m,a=0,p=1;
for (int i=1;i<=n;++i){
  std::cin>>k;
if(a+k<=m)
  a+=k;
  else if(n==m)
    p=n;
  else 
  {
    a=k;
    ++p;
  } 
}
  
std::cout<<p;
return 0;
}