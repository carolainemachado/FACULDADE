-- Circuito design
library IEEE;
use IEEE.std_logic_1164.all;

entity circuito is
port(
  a: in std_logic;
  b: in std_logic;
  c: in std_logic;
  s: out std_logic);
end circuito;

architecture rtl of circuito is
begin
  process(a, b, c) is
  begin
    s <= (a and b) or (b xor c);
  end process;
end rtl;
