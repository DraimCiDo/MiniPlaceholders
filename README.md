# MiniPlaceholders ![WorkFlow](https://img.shields.io/github/actions/workflow/status/MiniPlaceholders/MiniPlaceholders/build.yml?style=flat-square) [![Discord](https://img.shields.io/discord/899740810956910683?color=7289da&label=Discord)](https://discord.gg/5NMMzK5mAn)
MiniMessage Component-based Placeholders for PaperMC and Velocity platforms

## Compatibility
- Paper 1.19.3+
- Velocity 3.1.2+
- Krypton

## Commands:
### Velocity
`/vminiplaceholders <parse|help> <me|player> <player-to-parse>`
### Paper
`/miniplaceholders <parse|help> <me|player> <player-to-parse>`

## Usage

Check our usage wiki [here](https://github.com/MiniPlaceholders/MiniPlaceholders/wiki/User-Getting-Started)

## API

```java

class Main {
    public static void registerExpansion() {
        Expansion expansion = Expansion.builder("my-expansion")
                .filter(Player.class)
                .audiencePlaceholder("name", (aud, ctx, queue) -> {
                    return Tag.selfClosingInserting(aud.getName());
                })
                .globalPlaceholder("tps", (ctx, queue) -> {
                    return Tag.inserting(Component.text(Bukkit.getTps()[0]));
                }).build;
        
        expansion.register();
        
        Player player;
        player.sendMessage(miniMessage().deserialize("Player Name: <my-expansion_name>", MiniPlaceholders.getAudiencePlaceholders(player)));
    }
}

```

Check the available javadocs [here](https://javadoc.jitpack.io/com/github/4drian3d/MiniPlaceholders/latest/javadoc/index.html)

Or check the developer wiki [here](https://github.com/MiniPlaceholders/MiniPlaceholders/wiki/Developer-Getting-Started)

