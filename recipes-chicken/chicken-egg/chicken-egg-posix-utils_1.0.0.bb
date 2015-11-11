SECTION = "devel/chicken"
DESCRIPTION = "posix-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://posix-utils.meta;md5=56f720bd3f407dc0e94c0b7d04f00836"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/posix-utils/posix-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "6838d55edb0b43a995d9eaf19f07982a"
SRC_URI[sha256sum] = "732f790789afbadf863d1f86e42970b4dbb2ff8715f737c6ecc338ec38267c40"

S = "${WORKDIR}/posix-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
