SECTION = "devel/chicken"
DESCRIPTION = "Interface to Music Player Daemon"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mpd-client.meta;md5=de0c7d3fba4fafebc27708070a190b7f"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mpd-client/mpd-client-${PV}.tar.gz"

SRC_URI[md5sum] = "34b57701f15336f0562130070743e05c"
SRC_URI[sha256sum] = "3a2ea1a0d673d8636cc4f87b554150933278a323d108273037e48eca855d89c0"

S = "${WORKDIR}/mpd-client-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
