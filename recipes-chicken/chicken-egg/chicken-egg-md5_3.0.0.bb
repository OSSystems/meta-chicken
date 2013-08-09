SECTION = "devel/chicken"
DESCRIPTION = "Computes MD5 (RFC1321) checksums"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://md5.meta;md5=385cd5809b8d04d460c223fec18d0586"
DEPENDS_virtclass-cross += "chicken-egg-message-digest-cross"
DEPENDS += "chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} += "chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "db56b8fdac9e8456ffa2a1b10b868783"
SRC_URI[sha256sum] = "ef77a509218c743171275f908c50bcaf1417f9b2afd900589f0401e4a023c7f6"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
