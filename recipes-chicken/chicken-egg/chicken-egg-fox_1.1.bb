SECTION = "devel/chicken"
DESCRIPTION = "string formatting"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fox.meta;md5=d4994fe283c8890aa973c9cc0efddb67"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fox/fox-${PV}.tar.gz"

SRC_URI[md5sum] = "6059d030fe794966a54ff8accd986fc5"
SRC_URI[sha256sum] = "fd88d265695ae419218e5decbd56e33e1a87e436b2418df2a9b76053edfb9e07"

S = "${WORKDIR}/fox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
