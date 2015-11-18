SECTION = "devel/chicken"
DESCRIPTION = "Easy Pseudo-Terminal Interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pty.meta;md5=97899927a6ebed43e3c1fea91f428987"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pty/pty-${PV}.tar.gz"

SRC_URI[md5sum] = "07746c57f56e8bbb624e89f85df3b88a"
SRC_URI[sha256sum] = "6903b24ac18cbfe19d5285c51513e42699634fddd2280646585f303841aaf05f"

S = "${WORKDIR}/pty-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
