SECTION = "devel/chicken"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gochan.meta;md5=6c97bb6c4de278983b88c8ea3773dfb7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gochan/gochan-${PV}.tar.gz"

SRC_URI[md5sum] = "80a191224ef2e5749c6a152f203435e7"
SRC_URI[sha256sum] = "b4206a86600e9cc8605b1805cc802848d5659bc71da5774b27415a73c0174ee6"

S = "${WORKDIR}/gochan-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
