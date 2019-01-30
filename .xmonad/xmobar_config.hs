Config {
       font = "xft:Monospace:pixelsize=20",
       -- used to make the bar appear correctly after Mod-q in older xmonad implementations (0.9.x)
       -- doesn't seem to do anything anymore (0.10, darcs)
--       lowerOnStart = False,
       commands = [
           -- YYZ Toronto airport
           Run Weather "CYYZ" [ "--template", "<skyCondition> | <fc=#4682B4><tempC></fc>°C | <fc=#4682B4><rh></fc>% | <fc=#4682B4><pressure></fc>hPa"
                             ] 36000,
             Run Cpu ["-L","3","-H","50","--normal","green","--high","red"] 10,
             Run Memory ["-t","Mem: <usedratio>%"] 10,
             Run Date "%a %b %_d %l:%M" "date" 10,
             -- Run Network "ra0" [] 10,
             -- battery monitor
             Run Battery [ "--template" , "Batt: <acstatus>"
                         , "--Low"      , "10"        -- units: %
                         , "--High"     , "80"        -- units: %
                         , "--low"      , "darkred"
                         , "--normal"   , "darkorange"
                         , "--high"     , "darkgreen"
                         
                         , "--" -- battery specific options
                           -- discharging status
                         , "-o"	, "<left>% (<timeleft>)"
                           -- AC "on" status
                         , "-O"	, "<fc=#dAA520>Charging</fc>"
                           -- charged status
                         , "-i"	, "<fc=#006000>Charged</fc>"
                         ] 50,
             
             Run StdinReader
           ]
       , sepChar = "%"
       , alignSep = "}{"
       , template = "%StdinReader% }{ %battery% | %cpu% | %memory%     <fc=#ee9a00>%date%</fc> | %CYYZ%"
       }
