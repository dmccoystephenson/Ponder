package dansplugins.dansapi.toolbox.tools;

import java.util.UUID;

public interface IUUIDChecker {
    String findPlayerNameBasedOnUUID(UUID playerUUID);

    UUID findUUIDBasedOnPlayerName(String playerName);
}
