SECTION = "devel/chicken"
DESCRIPTION = "Find files in search path"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pathfinder.meta;md5=4b28932b0c5671a8b44166c15b66275f"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-posix-extras-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-posix-extras-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-posix-extras chicken-egg-regex-crosssdk chicken-egg-posix-extras-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-posix-extras chicken-egg-regex-cross chicken-egg-posix-extras-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-posix-extras"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pathfinder/pathfinder-${PV}.tar.gz"

SRC_URI[md5sum] = "0f1d2524196b546e62ca06ccaaccdeab"
SRC_URI[sha256sum] = "569cd83dafcf186891be90f81ee43a96a562e017077097085220e3d561f80efa"

S = "${WORKDIR}/pathfinder-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
